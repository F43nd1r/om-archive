
solution {
    puzzle = "P062"
    name = "B CG 6T"
    arm(ARM1) {
        number = 1
        position = 1 to -2
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = 3 to -1
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 3 to 1
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = 0 to 4
        rotation = -2
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = 1 to 4
        rotation = 10
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = -2 to 5
        rotation = -3
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = 2 to 3
        rotation = 4
        size = 3
    }
    arm(ARM1) {
        number = 8
        position = 4 to -2
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 9
        position = 2 to -3
        rotation = 1
        size = 3
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = -1
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = -1
    }
    glyph(MULTI_BONDER) {
        position = 0 to 1
        rotation = -1
    }
    glyph(MULTI_BONDER) {
        position = -3 to 3
        rotation = -1
    }
    glyph(EQUILIBRIUM) {
        position = -16 to 9
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 2 to 0
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = -25 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 1 to 1
        rotation = 0
    }
    track {
        position = -1 to -3
        positions = listOf(0 to 0, 1 to 0, 1 to 1, 2 to 1, 2 to 0, 3 to 0)
    }
    track {
        position = -3 to 5
        positions = listOf(0 to 0, 1 to 0, 2 to -1, 2 to -2, 3 to -2, 3 to -1, 4 to -1, 4 to -2, 5 to -2)
    }
    track {
        position = 2 to 1
        positions = listOf(0 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(6) {
                wait(10)
                forward()
                grab()
                pivotCounterClockwise()
                back()
                back()
                reset()
                wait(4)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(12)
                repeat()
            }
        }
        , 
        {
            sequence(9) {
                wait(4)
                grab()
                back()
                reset()
                wait(1)
                grab()
                back()
                reset()
                wait(3)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                grab()
                back()
                reset()
                wait(1)
                grab()
                back()
                rotateCounterClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                back()
                back()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(3)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
            }
        }
        , 
        {
            sequence(8) {
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
                wait(7)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                reset()
                wait(5)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
                grab()
                back()
                rotateClockwise()
                reset()
                wait(6)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(3)
                forward()
                wait(2)
                grab()
                back()
                back()
                back()
                rotateClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                forward()
                forward()
                grab()
                back()
                back()
                back()
                rotateClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                forward()
                forward()
                grab()
                back()
                back()
                back()
                rotateClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                forward()
                forward()
                grab()
                back()
                back()
                back()
                rotateClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                forward()
                forward()
                grab()
                back()
                back()
                back()
                rotateClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                forward()
                forward()
                grab()
                back()
                back()
                back()
                drop()
                wait(1)
                grab()
                rotateClockwise()
                drop()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(3)
                forward()
                wait(3)
                back()
                grab()
                back()
                drop()
                forward()
                wait(1)
                forward()
                wait(3)
                back()
                grab()
                back()
                drop()
                forward()
                wait(1)
                forward()
                wait(3)
                back()
                grab()
                back()
                drop()
                forward()
                wait(1)
                forward()
                wait(3)
                back()
                grab()
                back()
                drop()
                forward()
                wait(1)
                forward()
                wait(3)
                back()
                grab()
                back()
                drop()
                forward()
                wait(1)
                forward()
                wait(3)
                back()
                grab()
                back()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                grab()
                back()
                reset()
                wait(3)
                grab()
                back()
                reset()
                wait(1)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
            }
        }
        )
    }
}
