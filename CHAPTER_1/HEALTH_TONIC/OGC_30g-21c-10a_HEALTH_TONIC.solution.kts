
solution {
    puzzle = "P014"
    name = "OVERLAP!"
    arm(ARM1) {
        number = 1
        position = -1 to 2
        rotation = -3
        size = 1
    }
    glyph(BONDER) {
        position = -1 to 1
        rotation = -2
    }
    io(INPUT) {
        index = 0
        position = -1 to 1
        rotation = 3
    }
    io(OUTPUT) {
        index = 0
        position = 0 to 1
        rotation = -2
    }
    io(INPUT) {
        index = 1
        position = -1 to 0
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
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
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
