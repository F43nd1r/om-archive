
solution {
    puzzle = "P016"
    name = "B S"
    arm(ARM3) {
        number = 1
        position = -1 to 2
        rotation = 5
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -2 to 1
        rotation = 1
        size = 1
    }
    glyph(BONDER) {
        position = -1 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to 2
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
