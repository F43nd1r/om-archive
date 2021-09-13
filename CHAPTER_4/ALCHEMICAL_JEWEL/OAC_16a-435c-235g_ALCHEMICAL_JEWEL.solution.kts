
solution {
    puzzle = "P035"
    name = "OVERLAP AA"
    arm(ARM1) {
        number = 1
        position = -1 to -3
        rotation = 5
        size = 1
    }
    glyph(BONDER) {
        position = 0 to -3
        rotation = 0
    }
    glyph(BONDER) {
        position = -1 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = -1
    }
    glyph(BONDER) {
        position = 1 to -4
        rotation = 1
    }
    glyph(BONDER) {
        position = 0 to -2
        rotation = -1
    }
    glyph(BONDER) {
        position = -1 to -2
        rotation = 1
    }
    glyph(BONDER) {
        position = -2 to -1
        rotation = -7
    }
    glyph(BONDER) {
        position = -1 to -3
        rotation = -5
    }
    glyph(BONDER) {
        position = 0 to -3
        rotation = 2
    }
    glyph(MULTI_BONDER) {
        position = -1 to -1
        rotation = -1
    }
    glyph(MULTI_BONDER) {
        position = 0 to -3
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = -2 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to -3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 1 to -4
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 0 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to -2
        rotation = -12
    }
    io(INPUT) {
        index = 1
        position = -2 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 0 to -4
        rotation = 0
    }
    track {
        position = -1 to -3
        positions = listOf(1 to 0, 0 to 0, -1 to 1, -1 to 2, 0 to 2)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                forward()
                grab()
                rotateClockwise()
                forward()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                back()
                grab()
                rotateClockwise()
                pivotClockwise()
                forward()
                drop()
                back()
                back()
                back()
                back()
                rotateCounterClockwise()
                grab()
                forward()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                back()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                grab()
                rotateCounterClockwise()
                back()
                drop()
                forward()
                rotateClockwise()
                grab()
                back()
                drop()
                forward()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                forward()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                forward()
                drop()
                back()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                drop()
                rotateClockwise()
                rotateClockwise()
                back()
            }
        }
        )
    }
}
