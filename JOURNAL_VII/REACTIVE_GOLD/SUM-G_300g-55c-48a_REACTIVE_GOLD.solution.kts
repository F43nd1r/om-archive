
solution {
    puzzle = "P095"
    name = "B CG 6T"
    arm(ARM1) {
        number = 1
        position = 0 to -3
        rotation = -6
        size = 1
    }
    arm(ARM3) {
        number = 2
        position = 0 to 1
        rotation = -2
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 4 to -3
        rotation = -3
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = 4 to -2
        rotation = -3
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = 3 to -1
        rotation = -3
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = -2 to -2
        rotation = -6
        size = 2
    }
    arm(ARM6) {
        number = 7
        position = -3 to 0
        rotation = -4
        size = 1
    }
    arm(ARM1) {
        number = 8
        position = 1 to 1
        rotation = -2
        size = 2
    }
    glyph(BONDER) {
        position = -1 to 1
        rotation = -2
    }
    glyph(UNBONDER) {
        position = 1 to -2
        rotation = -3
    }
    glyph(PROJECTION) {
        position = 1 to -1
        rotation = -3
    }
    glyph(PURIFICATION) {
        position = -1 to -2
        rotation = 1
    }
    glyph(PURIFICATION) {
        position = -3 to 1
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = 2 to -3
        rotation = -3
    }
    io(OUTPUT) {
        index = 0
        position = 1 to 0
        rotation = -1
    }
    track {
        position = -1 to 2
        positions = listOf(0 to 0, 1 to -1)
    }
    track {
        position = -3 to -1
        positions = listOf(0 to 0, 1 to -1)
    }
    track {
        position = 2 to -1
        positions = listOf(2 to -1, 1 to 0, 1 to -1, 2 to -2)
    }
    tape {
        parallel(
        {
            sequence(7) {
                wait(9)
                grab()
                rotateCounterClockwise()
                drop()
                wait(1)
                grab()
                rotateCounterClockwise()
                drop()
                wait(1)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(8) {
                wait(15)
                grab()
                rotateClockwise()
                reset()
                wait(5)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(4)
                repeat()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
                wait(1)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                wait(3)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                back()
                pivotCounterClockwise()
                drop()
                forward()
                wait(4)
                grab()
                pivotClockwise()
                rotateCounterClockwise()
                drop()
                wait(1)
                grab()
                rotateCounterClockwise()
                wait(1)
                back()
                forward()
                rotateCounterClockwise()
                drop()
                wait(1)
                grab()
                rotateCounterClockwise()
                wait(1)
                back()
                forward()
                rotateCounterClockwise()
                drop()
                wait(1)
                grab()
                rotateCounterClockwise()
                wait(1)
                back()
                forward()
                rotateCounterClockwise()
                drop()
                wait(1)
                grab()
                rotateCounterClockwise()
                wait(1)
                back()
                forward()
                rotateCounterClockwise()
                drop()
                wait(1)
                grab()
                rotateCounterClockwise()
                wait(1)
                back()
                forward()
                rotateCounterClockwise()
                drop()
                wait(1)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(6)
                grab()
                back()
                reset()
                wait(1)
                grab()
                back()
                reset()
                wait(1)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                back()
                back()
                drop()
                back()
                back()
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(3)
                back()
                grab()
                back()
                back()
                drop()
                back()
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                back()
                back()
                wait(1)
                back()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(4)
                back()
                back()
                grab()
                back()
                back()
                drop()
                back()
                back()
                grab()
                back()
                back()
                drop()
                back()
                back()
                grab()
                back()
                back()
                drop()
                back()
                back()
                grab()
                back()
                back()
                drop()
                back()
                back()
                grab()
                back()
                back()
                drop()
                back()
                back()
                grab()
                back()
                back()
                drop()
                back()
                back()
                grab()
                back()
                back()
                drop()
                back()
                back()
                grab()
                back()
                back()
                drop()
                back()
                back()
                back()
                reset()
            }
        }
        )
    }
}
