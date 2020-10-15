
solution {
    puzzle = "P025"
    name = "B CA 2T"
    arm(ARM1) {
        number = 1
        position = -1 to 1
        rotation = 4
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = -3 to -1
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -3 to 1
        rotation = 4
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -1 to 0
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = -3 to -2
        rotation = 5
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = -2 to -3
        rotation = 5
        size = 1
    }
    arm(ARM1) {
        number = 7
        position = 0 to -4
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 8
        position = 0 to -1
        rotation = 3
        size = 1
    }
    glyph(MULTI_BONDER) {
        position = -1 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 0 to -3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -2 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to -4
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 2 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -3 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -1 to -4
        rotation = 0
    }
    track {
        position = -3 to 1
        positions = listOf(0 to 0, 1 to -1, 2 to -1, 3 to -2, 4 to -2)
    }
    tape {
        parallel(
        {
            sequence(2) {
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                reset()
                wait(4)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                forward()
                reset()
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(4)
                grab()
                rotateClockwise()
                reset()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(5)
                back()
                grab()
                forward()
                wait(1)
                forward()
                rotateCounterClockwise()
                drop()
                back()
                reset()
            }
        }
        , 
        {
            sequence(8) {
                wait(7)
                grab()
                forward()
                rotateCounterClockwise()
                reset()
                wait(2)
                repeat()
            }
        }
        , 
        {
            sequence(1) {
                wait(3)
                grab()
                pivotClockwise()
                wait(1)
                pivotClockwise()
                drop()
                wait(3)
                grab()
                pivotClockwise()
                drop()
            }
        }
        )
    }
}
