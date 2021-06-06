
solution {
    puzzle = "P069"
    name = "OG"
    arm(ARM1) {
        number = 1
        position = 2 to 0
        rotation = -3
        size = 1
    }
    glyph(BONDER) {
        position = 3 to 0
        rotation = 4
    }
    glyph(CALCIFICATION) {
        position = 2 to -1
        rotation = 0
    }
    glyph(DISPERSION) {
        position = 2 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 1 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 3 to 0
        rotation = 4
    }
    io(OUTPUT) {
        index = 1
        position = 3 to -1
        rotation = 1
    }
    io(OUTPUT) {
        index = 2
        position = 3 to 0
        rotation = -2
    }
    io(OUTPUT) {
        index = 3
        position = 2 to -1
        rotation = 0
    }
    track {
        position = 2 to 0
        positions = listOf(0 to 0, 0 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                forward()
                rotateClockwise()
                grab()
                back()
                rotateClockwise()
                drop()
                forward()
                grab()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                drop()
                forward()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                forward()
                rotateClockwise()
                grab()
                back()
                drop()
                forward()
                rotateClockwise()
                grab()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                forward()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                back()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
            }
        }
        )
    }
}
