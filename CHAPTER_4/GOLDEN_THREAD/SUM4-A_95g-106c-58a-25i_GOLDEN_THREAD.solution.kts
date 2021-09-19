
solution {
    puzzle = "P037"
    name = "SUM4 - 284"
    arm(ARM6) {
        number = 1
        position = -2 to 0
        rotation = -3
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 0 to -1
        rotation = -3
        size = 1
    }
    glyph(BONDER) {
        position = -2 to 1
        rotation = -1
    }
    glyph(BONDER) {
        position = 1 to 1
        rotation = 1
    }
    glyph(BONDER) {
        position = 0 to 1
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = -2 to -1
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = 2 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -1 to -1
        rotation = 0
    }
    track {
        position = 1 to -1
        positions = listOf(1 to 0, 0 to 0, -1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                rotateClockwise()
                drop()
                wait(1)
                extendTape()
            }
        }
        , 
        {
            sequence(2) {
                wait(7)
                grab()
                rotateClockwise()
                drop()
                wait(2)
                grab()
                rotateClockwise()
                back()
                back()
                reset()
            }
        }
        )
    }
}
