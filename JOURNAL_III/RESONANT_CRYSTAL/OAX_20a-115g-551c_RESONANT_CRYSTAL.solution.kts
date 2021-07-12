
solution {
    puzzle = "P066"
    name = "OVERLAP AG"
    arm(ARM1) {
        number = 1
        position = -1 to 1
        rotation = -2
        size = 1
    }
    glyph(BONDER) {
        position = -2 to 1
        rotation = -1
    }
    glyph(BONDER) {
        position = -2 to 1
        rotation = -2
    }
    glyph(BONDER) {
        position = -4 to -1
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = -2 to -1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -1 to -3
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = -1 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -2 to -1
        rotation = 0
    }
    track {
        position = -2 to 1
        positions = listOf(1 to 0, 0 to 0, -1 to 0, -1 to -1, 0 to -2)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                drop()
                forward()
                forward()
                forward()
                rotateCounterClockwise()
                grab()
                forward()
                drop()
                rotateClockwise()
                back()
                back()
                back()
                back()
                grab()
                rotateClockwise()
                forward()
                forward()
                pivotClockwise()
                forward()
                forward()
                drop()
                back()
                back()
                back()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                forward()
                pivotClockwise()
                forward()
                forward()
                drop()
                back()
                back()
                back()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                forward()
                pivotClockwise()
                forward()
                drop()
                back()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                forward()
                forward()
                drop()
                rotateClockwise()
                back()
                back()
                back()
                grab()
                rotateClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
