
solution {
    puzzle = "P029"
    name = "B GX NOGIF"
    arm(ARM1) {
        number = 1
        position = 1 to 0
        rotation = -1
        size = 2
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = 5
    }
    glyph(CALCIFICATION) {
        position = 0 to 1
        rotation = 0
    }
    glyph(PROJECTION) {
        position = 2 to -3
        rotation = 2
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 7
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 6
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 6
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 8
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 8
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 9
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 10
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 10
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 10
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to 9
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 9
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to 8
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to 8
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to 7
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 5 to 6
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 6 to 5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 7 to 4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 8 to 3
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 2 to 1
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = -3 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 3 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 4 to -3
        rotation = 0
    }
    track {
        position = 1 to 0
        positions = listOf(0 to 0, 1 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                back()
                grab()
                rotateClockwise()
                forward()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                back()
                grab()
                forward()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateClockwise()
                drop()
                rotateClockwise()
                forward()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                rotateClockwise()
                rotateCounterClockwise()
                back()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
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
                forward()
                pivotClockwise()
                rotateClockwise()
                drop()
                back()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                back()
                grab()
                forward()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                back()
                grab()
                pivotClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                rotateClockwise()
                rotateCounterClockwise()
                back()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
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
                forward()
                pivotClockwise()
                rotateClockwise()
                drop()
                back()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                back()
                grab()
                forward()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                back()
                grab()
                pivotClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                rotateClockwise()
                rotateCounterClockwise()
                back()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
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
                forward()
                pivotClockwise()
                rotateClockwise()
                drop()
                back()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                back()
                grab()
                forward()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                back()
                grab()
                pivotClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                rotateClockwise()
                rotateCounterClockwise()
                back()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
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
                forward()
                pivotClockwise()
                rotateClockwise()
                drop()
                back()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                back()
                grab()
                forward()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                back()
                grab()
                pivotClockwise()
                rotateCounterClockwise()
                rotateClockwise()
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
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                rotateClockwise()
                rotateCounterClockwise()
                back()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
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
                forward()
                pivotClockwise()
                rotateClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                drop()
                back()
                rotateClockwise()
                rotateClockwise()
                grab()
                forward()
                drop()
                back()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                back()
                grab()
                forward()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                back()
                grab()
                rotateCounterClockwise()
                rotateClockwise()
            }
        }
        )
    }
}
