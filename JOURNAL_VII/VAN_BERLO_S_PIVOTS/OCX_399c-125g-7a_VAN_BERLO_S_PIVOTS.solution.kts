
solution {
    puzzle = "P096"
    name = "OVERLAP AA"
    arm(ARM1) {
        number = 1
        position = -1 to -1
        rotation = 1
        size = 1
    }
    glyph(BONDER) {
        position = -2 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = -1
    }
    glyph(BONDER) {
        position = -2 to 0
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -1 to -1
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -1 to -1
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -1 to -1
        rotation = -2
    }
    glyph(UNBONDER) {
        position = -1 to -1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -2 to -1
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = -1 to -1
        rotation = 0
    }
    glyph(DISPOSAL) {
        position = -1 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = -1 to -1
        rotation = 2
    }
    io(OUTPUT) {
        index = 2
        position = -1 to -1
        rotation = 3
    }
    io(OUTPUT) {
        index = 3
        position = -1 to -1
        rotation = -1
    }
    track {
        position = -2 to -1
        positions = listOf(0 to 0, 1 to 0, 2 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                back()
                grab()
                rotateCounterClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                pivotClockwise()
                back()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                forward()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                grab()
                back()
                rotateCounterClockwise()
                drop()
                forward()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                forward()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                back()
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
