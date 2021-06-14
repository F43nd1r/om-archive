
solution {
    puzzle = "P016"
    name = "B CI14 1-2T"
    arm(ARM1) {
        number = 1
        position = 2 to -2
        rotation = 2
        size = 2
    }
    arm(ARM6) {
        number = 2
        position = 1 to -1
        rotation = 2
        size = 1
    }
    arm(ARM3) {
        number = 3
        position = 0 to -2
        rotation = 1
        size = 1
    }
    arm(ARM6) {
        number = 4
        position = -2 to -2
        rotation = 2
        size = 1
    }
    glyph(MULTI_BONDER) {
        position = -1 to 0
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = 0 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -4 to 1
        rotation = -2
    }
    track {
        position = 1 to -2
        positions = listOf(0 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(3) {
                wait(4)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                back()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(6)
                grab()
                pivotCounterClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        )
    }
}
