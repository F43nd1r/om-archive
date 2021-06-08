
solution {
    puzzle = "P012"
    name = "OAX"
    arm(ARM1) {
        number = 1
        position = -1 to 1
        rotation = 4
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -3 to 2
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = 1
    }
    glyph(BONDER) {
        position = -1 to 1
        rotation = 1
    }
    glyph(PROJECTION) {
        position = -2 to 2
        rotation = 4
    }
    glyph(PROJECTION) {
        position = -2 to 1
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = 0 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 1
        rotation = 1
    }
    io(INPUT) {
        index = 1
        position = -1 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -2 to 2
        rotation = 0
    }
    track {
        position = -1 to 1
        positions = listOf(0 to 0, -1 to 0)
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(1)
                grab()
                drop()
                wait(1)
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateClockwise()
                grab()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
            }
        }
        )
    }
}
