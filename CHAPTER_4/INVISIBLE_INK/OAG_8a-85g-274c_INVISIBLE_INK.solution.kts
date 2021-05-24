
solution {
    puzzle = "P032"
    name = "OVERLAP AG"
    arm(ARM1) {
        number = 1
        position = 2 to -2
        rotation = -3
        size = 1
    }
    glyph(BONDER) {
        position = 2 to -2
        rotation = -3
    }
    glyph(BONDER) {
        position = 3 to -2
        rotation = -3
    }
    glyph(CALCIFICATION) {
        position = 2 to -1
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = 2 to -1
        rotation = -3
    }
    io(OUTPUT) {
        index = 0
        position = 2 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 1 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = 2 to -2
        rotation = -3
    }
    track {
        position = 1 to 0
        positions = listOf(1 to -2, 1 to -1, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                forward()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                back()
                back()
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                forward()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                back()
                back()
                grab()
                forward()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                back()
                reset()
            }
        }
        )
    }
}
