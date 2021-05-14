
solution {
    puzzle = "P033"
    name = "OAG"
    arm(ARM1) {
        number = 1
        position = -2 to 2
        rotation = 5
        size = 1
    }
    glyph(BONDER) {
        position = -3 to 1
        rotation = -2
    }
    glyph(BONDER) {
        position = -3 to 1
        rotation = 2
    }
    glyph(MULTI_BONDER) {
        position = -3 to 1
        rotation = 1
    }
    glyph(PURIFICATION) {
        position = -1 to 0
        rotation = -4
    }
    io(INPUT) {
        index = 0
        position = -1 to 1
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = -14 to 1
        rotation = 0
    }
    track {
        position = -2 to 2
        positions = listOf(-1 to 0, 0 to 0, 0 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                forward()
                drop()
                back()
                grab()
                rotateClockwise()
                drop()
                forward()
                grab()
                back()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                forward()
                drop()
                back()
                grab()
                rotateClockwise()
                drop()
                forward()
                grab()
                rotateCounterClockwise()
                drop()
                back()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                forward()
                grab()
                back()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                forward()
                drop()
                back()
                grab()
                rotateClockwise()
                drop()
                forward()
                grab()
                rotateCounterClockwise()
                drop()
                back()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                forward()
                drop()
                forward()
                rotateClockwise()
                grab()
                rotateClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                grab()
                forward()
                drop()
                back()
                grab()
                rotateClockwise()
                drop()
                rotateClockwise()
                grab()
                back()
                reset()
            }
        }
        )
    }
}
