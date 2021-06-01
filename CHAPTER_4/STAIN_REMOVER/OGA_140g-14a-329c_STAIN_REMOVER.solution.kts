
solution {
    puzzle = "P034"
    name = "OVERLAP AA"
    arm(ARM1) {
        number = 1
        position = -1 to 0
        rotation = 4
        size = 1
    }
    glyph(BONDER) {
        position = -2 to -1
        rotation = -5
    }
    glyph(BONDER) {
        position = -3 to 1
        rotation = -1
    }
    glyph(BONDER) {
        position = -2 to 1
        rotation = -2
    }
    glyph(BONDER) {
        position = -2 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = -1 to -1
        rotation = -4
    }
    glyph(BONDER) {
        position = -1 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 0 to -1
        rotation = 0
    }
    glyph(PURIFICATION) {
        position = -3 to -1
        rotation = 1
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -2 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -2 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -5 to 0
        rotation = 0
    }
    track {
        position = 0 to -1
        positions = listOf(-1 to 1, -2 to 1, -3 to 1, -4 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                forward()
                rotateClockwise()
                rotateClockwise()
                forward()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                back()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                grab()
                back()
                back()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                back()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                drop()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                forward()
                grab()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                back()
                reset()
            }
        }
        )
    }
}
