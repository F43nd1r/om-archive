
solution {
    puzzle = "P029"
    name = "B GA NOGIF"
    arm(ARM1) {
        number = 1
        position = -4 to 4
        rotation = 7
        size = 2
    }
    glyph(BONDER) {
        position = -1 to 3
        rotation = 8
    }
    glyph(CALCIFICATION) {
        position = -3 to 4
        rotation = 0
    }
    glyph(PROJECTION) {
        position = -5 to 5
        rotation = 6
    }
    glyph(EQUILIBRIUM) {
        position = -5 to 6
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 6
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to 4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 6
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to -5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to -7
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to -7
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to -7
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to -8
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to -5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to -6
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -5 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -6 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -7 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -8 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -9 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -6 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to -7
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to -6
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to -5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 3
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -4 to 6
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = -9 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -4 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -6 to 6
        rotation = 0
    }
    track {
        position = -3 to 3
        positions = listOf(0 to 0, -1 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                pivotCounterClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                back()
                drop()
                forward()
                grab()
                back()
                drop()
                rotateClockwise()
                grab()
                rotateClockwise()
                forward()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                forward()
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                back()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                back()
                drop()
                forward()
                grab()
                back()
                drop()
                rotateClockwise()
                grab()
                rotateClockwise()
                forward()
                drop()
                back()
                grab()
                rotateClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                forward()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                back()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                back()
                drop()
                forward()
                grab()
                back()
                drop()
                rotateClockwise()
                grab()
                rotateClockwise()
                drop()
                forward()
                grab()
                back()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                drop()
                back()
                grab()
                rotateCounterClockwise()
                drop()
                forward()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                back()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                back()
                drop()
                forward()
                grab()
                back()
                drop()
                rotateClockwise()
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                grab()
                pivotClockwise()
                drop()
                rotateClockwise()
                back()
                grab()
                forward()
                drop()
                back()
                grab()
                forward()
                back()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                drop()
                forward()
                grab()
                back()
                drop()
                rotateClockwise()
                forward()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                back()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                back()
                drop()
                forward()
                grab()
                back()
                drop()
                rotateClockwise()
                grab()
                rotateClockwise()
                drop()
                forward()
                grab()
                back()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                drop()
                back()
                grab()
                rotateCounterClockwise()
                drop()
                forward()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                back()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                back()
                drop()
                forward()
                grab()
                back()
                drop()
                rotateClockwise()
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                grab()
                pivotClockwise()
                drop()
                rotateClockwise()
                back()
                grab()
                forward()
                drop()
                back()
                grab()
                forward()
                back()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                drop()
                forward()
                grab()
                back()
                drop()
                rotateClockwise()
                forward()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                back()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                back()
                drop()
                forward()
                grab()
                back()
                drop()
                rotateClockwise()
                grab()
                rotateClockwise()
                drop()
                forward()
                grab()
                back()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                drop()
                back()
                grab()
                rotateCounterClockwise()
                drop()
                forward()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                back()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                back()
                drop()
                forward()
                grab()
                back()
                drop()
                rotateClockwise()
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                grab()
                pivotClockwise()
                drop()
                rotateClockwise()
                back()
                grab()
                forward()
                drop()
                back()
                grab()
                forward()
                back()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                drop()
                forward()
                grab()
                back()
                drop()
                rotateClockwise()
                forward()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                back()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                back()
                drop()
                forward()
                grab()
                back()
                drop()
                rotateClockwise()
                grab()
                rotateClockwise()
                drop()
                forward()
                grab()
                back()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                drop()
                back()
                grab()
                rotateCounterClockwise()
                drop()
                forward()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                back()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                back()
                drop()
                forward()
                grab()
                back()
                drop()
                rotateClockwise()
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                grab()
                pivotClockwise()
                drop()
                rotateClockwise()
                back()
                grab()
                forward()
                drop()
                back()
                grab()
                forward()
                back()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                drop()
                forward()
                grab()
                back()
                drop()
                rotateClockwise()
                forward()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                back()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                back()
                drop()
                forward()
                grab()
                back()
                drop()
                rotateClockwise()
                grab()
                rotateClockwise()
                drop()
                forward()
                grab()
                back()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                drop()
                back()
                grab()
                rotateCounterClockwise()
                drop()
                forward()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                back()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                back()
                drop()
                forward()
                grab()
                back()
                drop()
                rotateClockwise()
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                grab()
                pivotClockwise()
                drop()
                rotateClockwise()
                back()
                grab()
                forward()
                drop()
                back()
                grab()
                forward()
                back()
                pivotClockwise()
            }
        }
        )
    }
}
