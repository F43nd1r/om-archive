
solution {
    puzzle = "P015"
    name = "OA"
    arm(ARM1) {
        number = 1
        position = -1 to -1
        rotation = 9
        size = 1
    }
    glyph(BONDER) {
        position = -3 to 0
        rotation = 0
    }
    glyph(BONDER) {
        position = -2 to 0
        rotation = 0
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = 2
    }
    glyph(UNBONDER) {
        position = -2 to -2
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -2 to -1
        rotation = 2
    }
    glyph(PROJECTION) {
        position = -3 to 0
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = -3 to 0
        rotation = 5
    }
    io(OUTPUT) {
        index = 0
        position = -2 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -3 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -3 to 0
        rotation = 0
    }
    track {
        position = -2 to 0
        positions = listOf(0 to 0, 1 to -1, 0 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                back()
                grab()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                drop()
                back()
                rotateClockwise()
                rotateClockwise()
                back()
                grab()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                back()
                grab()
                forward()
                drop()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                grab()
                forward()
                reset()
            }
        }
        )
    }
}
