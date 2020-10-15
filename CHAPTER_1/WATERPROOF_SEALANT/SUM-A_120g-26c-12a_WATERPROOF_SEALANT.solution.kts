
solution {
    puzzle = "P011"
    name = "B CA 2T"
    arm(ARM1) {
        number = 1
        position = -1 to -2
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 0 to -3
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 2 to -3
        rotation = 3
        size = 1
    }
    arm(PISTON) {
        number = 4
        position = 1 to -4
        rotation = 1
        size = 1
    }
    glyph(BONDER) {
        position = 0 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 1 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -1 to -1
        rotation = 0
    }
    track {
        position = 2 to -2
        positions = listOf(0 to 0, 0 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
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
            sequence(4) {
                wait(4)
                grab()
                extend()
                pivotClockwise()
                pivotClockwise()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                back()
                reset()
            }
        }
        )
    }
}
