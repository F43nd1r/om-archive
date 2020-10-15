
solution {
    puzzle = "P085"
    name = "B GX 6T"
    arm(ARM1) {
        number = 1
        position = 1 to 1
        rotation = 5
        size = 2
    }
    glyph(BONDER) {
        position = -1 to 1
        rotation = 1
    }
    glyph(EQUILIBRIUM) {
        position = 0 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -5 to 5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 12
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 7 to 7
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 6 to 8
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 5 to 8
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to 11
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 11
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to 12
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 7
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to 3
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 3 to -1
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = -3 to 4
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 1 to 0
        rotation = 0
    }
    track {
        position = 1 to 1
        positions = listOf(0 to 0, 0 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                rotateClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                pivotCounterClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                drop()
                forward()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                back()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                forward()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                forward()
                pivotCounterClockwise()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                forward()
                drop()
                back()
                grab()
                forward()
                pivotClockwise()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                grab()
                rotateClockwise()
                rotateClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                pivotCounterClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                drop()
                forward()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                back()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                forward()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                forward()
                pivotCounterClockwise()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                grab()
                rotateCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                grab()
                rotateClockwise()
                rotateClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                pivotCounterClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                drop()
                forward()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                back()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                forward()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                forward()
                pivotCounterClockwise()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                grab()
                rotateCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                grab()
                rotateClockwise()
                rotateClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                pivotCounterClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                drop()
                forward()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                back()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                forward()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                forward()
                pivotCounterClockwise()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                grab()
                rotateCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                grab()
                rotateClockwise()
                rotateClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                pivotCounterClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                drop()
                forward()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                back()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                forward()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                forward()
                pivotCounterClockwise()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                grab()
                rotateCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                grab()
                rotateClockwise()
                rotateClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                pivotCounterClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                drop()
                forward()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                back()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                forward()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                forward()
                pivotCounterClockwise()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                grab()
                rotateCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                rotateClockwise()
                back()
                reset()
            }
        }
        )
    }
}
