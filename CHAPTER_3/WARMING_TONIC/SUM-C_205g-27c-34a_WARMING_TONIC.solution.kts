
solution {
    puzzle = "P028"
    name = "B CGX 2T"
    arm(ARM1) {
        number = 1
        position = -4 to 2
        rotation = 10
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = -5 to 3
        rotation = 10
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -2 to -2
        rotation = 8
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -3 to -1
        rotation = 8
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = -1 to -2
        rotation = 7
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = 1 to -3
        rotation = 8
        size = 2
    }
    arm(ARM1) {
        number = 7
        position = 2 to -3
        rotation = 8
        size = 2
    }
    glyph(MULTI_BONDER) {
        position = -2 to 0
        rotation = 6
    }
    glyph(CALCIFICATION) {
        position = -2 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to -1
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = -1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -5 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -4 to 0
        rotation = 0
    }
    track {
        position = 1 to -2
        positions = listOf(0 to 0, 1 to -1, 0 to -1)
    }
    tape {
        parallel(
        {
            sequence(5) {
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                grab()
                forward()
                pivotClockwise()
                forward()
                pivotClockwise()
                pivotClockwise()
                drop()
                forward()
            }
        }
        , 
        {
            sequence(7) {
                wait(3)
                forward()
                grab()
                forward()
                pivotClockwise()
                forward()
                pivotClockwise()
                pivotClockwise()
                drop()
            }
        }
        )
    }
}
