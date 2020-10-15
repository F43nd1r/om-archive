
solution {
    puzzle = "P085"
    name = "B GA 6T"
    arm(ARM1) {
        number = 1
        position = 4 to 0
        rotation = 4
        size = 3
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = 1
    }
    glyph(EQUILIBRIUM) {
        position = 3 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 5 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 10 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 11
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to 11
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 10 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to 10
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to 9
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 5 to 8
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 6 to 7
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 7 to 6
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 8 to 5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 9 to 4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 9 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 8 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 7 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 6 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 6
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 7
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 8
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 9
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 10
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 4 to -3
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = -1 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 4 to -4
        rotation = 0
    }
    track {
        position = 4 to -1
        positions = listOf(0 to 0, 0 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                rotateClockwise()
                pivotClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                rotateClockwise()
                rotateClockwise()
                forward()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                rotateClockwise()
                forward()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                rotateClockwise()
                drop()
                forward()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                rotateClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                forward()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                back()
                grab()
                rotateCounterClockwise()
                drop()
                forward()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                rotateClockwise()
                forward()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                rotateClockwise()
                drop()
                forward()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                rotateClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                forward()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                back()
                pivotCounterClockwise()
                forward()
                drop()
                rotateClockwise()
                back()
                grab()
                rotateCounterClockwise()
                drop()
                forward()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                back()
                drop()
                forward()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                rotateClockwise()
                forward()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                rotateClockwise()
                drop()
                forward()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                rotateClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                forward()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                back()
                pivotCounterClockwise()
                forward()
                drop()
                rotateClockwise()
                back()
                grab()
                rotateCounterClockwise()
                drop()
                forward()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                back()
                drop()
                forward()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                rotateClockwise()
                forward()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                rotateClockwise()
                drop()
                forward()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                rotateClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                forward()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                back()
                pivotCounterClockwise()
                forward()
                drop()
                rotateClockwise()
                back()
                grab()
                rotateCounterClockwise()
                drop()
                forward()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                back()
                drop()
                forward()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                back()
                pivotCounterClockwise()
                drop()
                forward()
                grab()
                rotateClockwise()
                drop()
                back()
                grab()
                forward()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                rotateClockwise()
                forward()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                rotateClockwise()
                drop()
                forward()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                rotateClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                forward()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                back()
                pivotCounterClockwise()
                forward()
                drop()
                rotateClockwise()
                back()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                forward()
                grab()
                back()
                drop()
                forward()
                grab()
                rotateCounterClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                pivotCounterClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                reset()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                rotateClockwise()
                drop()
                forward()
                grab()
                back()
                pivotClockwise()
                drop()
                forward()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                drop()
                rotateClockwise()
                forward()
                grab()
                back()
                pivotClockwise()
                forward()
                drop()
                back()
                grab()
                pivotCounterClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
