
solution {
    puzzle = "P039"
    name = "B GA 6T"
    arm(ARM1) {
        number = 1
        position = 1 to 0
        rotation = -1
        size = 2
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = 0 to -2
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
        position = 2 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -5 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 11
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 11
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 11
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to 11
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 10
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 9
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 8
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 7
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 6
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 10
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to 10
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to 9
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to 8
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 5 to 7
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 6 to 6
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 7 to 5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 8 to 4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 9 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 9 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 9 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -5 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 1
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = -4 to 3
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
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                rotateCounterClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                rotateClockwise()
                rotateClockwise()
                pivotClockwise()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                rotateClockwise()
                drop()
                back()
                grab()
                forward()
                pivotClockwise()
                pivotCounterClockwise()
                drop()
                back()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                rotateCounterClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                rotateClockwise()
                drop()
                back()
                grab()
                forward()
                drop()
                rotateClockwise()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                back()
                grab()
                forward()
                back()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                rotateClockwise()
                drop()
                back()
                grab()
                forward()
                pivotClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                pivotCounterClockwise()
                drop()
                back()
                grab()
                forward()
                back()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                rotateCounterClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                rotateClockwise()
                drop()
                back()
                grab()
                forward()
                drop()
                rotateClockwise()
                grab()
                pivotCounterClockwise()
                drop()
                back()
                grab()
                forward()
                back()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                rotateClockwise()
                drop()
                back()
                grab()
                forward()
                pivotClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                pivotCounterClockwise()
                drop()
                back()
                grab()
                forward()
                back()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                rotateCounterClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                rotateClockwise()
                drop()
                back()
                grab()
                forward()
                drop()
                rotateClockwise()
                grab()
                pivotCounterClockwise()
                drop()
                back()
                grab()
                forward()
                back()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                rotateClockwise()
                drop()
                back()
                grab()
                forward()
                pivotClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                pivotCounterClockwise()
                drop()
                back()
                grab()
                forward()
                back()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                rotateCounterClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                rotateClockwise()
                drop()
                back()
                grab()
                forward()
                drop()
                rotateClockwise()
                grab()
                pivotCounterClockwise()
                drop()
                back()
                grab()
                forward()
                back()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                rotateClockwise()
                drop()
                back()
                grab()
                forward()
                pivotClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                pivotCounterClockwise()
                drop()
                back()
                grab()
                forward()
                back()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                rotateCounterClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                rotateClockwise()
                drop()
                back()
                grab()
                forward()
                drop()
                rotateClockwise()
                grab()
                pivotCounterClockwise()
                drop()
                back()
                grab()
                forward()
                back()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                rotateClockwise()
                drop()
                back()
                grab()
                forward()
                pivotClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                pivotCounterClockwise()
                drop()
                back()
                grab()
                forward()
                back()
                pivotClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
