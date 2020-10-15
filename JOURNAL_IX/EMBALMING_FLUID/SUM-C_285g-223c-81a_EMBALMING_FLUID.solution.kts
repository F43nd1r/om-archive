
solution {
    puzzle = "P108"
    name = "B X S"
    arm(ARM1) {
        number = 1
        position = -5 to 2
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = -7 to 0
        rotation = 0
        size = 2
    }
    arm(ARM6) {
        number = 3
        position = -3 to -2
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -6 to -4
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = -4 to 0
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = 1 to -5
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 7
        position = -1 to -6
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 8
        position = -1 to 1
        rotation = 3
        size = 3
    }
    glyph(BONDER) {
        position = -3 to -1
        rotation = -1
    }
    glyph(BONDER) {
        position = -1 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = -2 to -1
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -5 to 0
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -1 to -4
        rotation = 1
    }
    glyph(PROJECTION) {
        position = 1 to -3
        rotation = 2
    }
    glyph(ANIMISMUS) {
        position = -5 to -2
        rotation = 1
    }
    glyph(DISPOSAL) {
        position = -3 to -4
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 3 to -2
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = -7 to 2
        rotation = 4
    }
    io(INPUT) {
        index = 1
        position = -1 to -5
        rotation = 5
    }
    io(INPUT) {
        index = 2
        position = -4 to 1
        rotation = 0
    }
    track {
        position = -5 to 2
        positions = listOf(0 to 0, 0 to -1)
    }
    track {
        position = -1 to 2
        positions = listOf(0 to 0, 0 to -1, 1 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                forward()
                reset()
                wait(4)
                repeat()
                wait(11)
                repeat()
            }
        }
        , 
        {
            sequence(8) {
                wait(10)
                grab()
                forward()
                rotateCounterClockwise()
                wait(1)
                rotateCounterClockwise()
                forward()
                rotateClockwise()
                back()
                pivotClockwise()
                forward()
                wait(1)
                back()
                pivotClockwise()
                forward()
                rotateCounterClockwise()
                wait(1)
                rotateClockwise()
                back()
                pivotCounterClockwise()
                forward()
                back()
                rotateCounterClockwise()
                back()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                back()
                wait(1)
                rotateClockwise()
                back()
                pivotCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(4)
                grab()
                rotateClockwise()
                reset()
                wait(9)
                repeat()
                wait(11)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                wait(1)
                repeat()
                wait(11)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(9)
                grab()
                rotateClockwise()
                reset()
                wait(10)
                repeat()
                wait(10)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(5)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                wait(3)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(11)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(6)
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(3)
                repeat()
                wait(5)
                repeat()
                wait(8)
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(8)
                grab()
                rotateCounterClockwise()
                reset()
                wait(4)
                repeat()
                wait(5)
                repeat()
                wait(10)
                repeat()
            }
        }
        )
    }
}
