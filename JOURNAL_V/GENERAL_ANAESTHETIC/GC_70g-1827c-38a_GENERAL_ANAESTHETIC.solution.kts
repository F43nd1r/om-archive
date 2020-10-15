
solution {
    puzzle = "P086"
    name = "B GA"
    arm(ARM1) {
        number = 1
        position = -1 to 0
        rotation = -3
        size = 2
    }
    glyph(BONDER) {
        position = -1 to -3
        rotation = -9
    }
    glyph(ANIMISMUS) {
        position = 1 to -2
        rotation = -10
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to -5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to -5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -6
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to -5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to -3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 2 to -5
        rotation = 9
    }
    io(INPUT) {
        index = 0
        position = -3 to 0
        rotation = 0
    }
    track {
        position = -2 to -1
        positions = listOf(0 to 0, 1 to 0, 1 to 1, 0 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                drop()
                rotateClockwise()
                rotateClockwise()
                forward()
                forward()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                forward()
                grab()
                forward()
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
                forward()
                forward()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                back()
                drop()
                rotateClockwise()
                rotateClockwise()
                forward()
                forward()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                forward()
                grab()
                back()
                back()
                rotateClockwise()
                pivotCounterClockwise()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                rotateClockwise()
                forward()
                pivotCounterClockwise()
                back()
                back()
                drop()
                forward()
                forward()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                back()
                drop()
                rotateClockwise()
                rotateClockwise()
                forward()
                forward()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                forward()
                grab()
                back()
                back()
                rotateClockwise()
                forward()
                pivotCounterClockwise()
                back()
                back()
                drop()
                forward()
                forward()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                back()
                forward()
                pivotCounterClockwise()
                back()
                back()
                rotateCounterClockwise()
                drop()
                forward()
                forward()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                back()
                back()
                drop()
                rotateCounterClockwise()
                grab()
                pivotClockwise()
                back()
                pivotClockwise()
                pivotCounterClockwise()
                drop()
                back()
                grab()
                pivotCounterClockwise()
                forward()
                drop()
                back()
                grab()
                back()
                back()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                forward()
                drop()
                forward()
                forward()
                grab()
                forward()
                pivotCounterClockwise()
                drop()
                forward()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                forward()
                forward()
                rotateClockwise()
                forward()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                forward()
                rotateCounterClockwise()
                drop()
                forward()
                forward()
                grab()
                pivotClockwise()
                back()
                drop()
                back()
                grab()
                back()
                back()
                rotateCounterClockwise()
                back()
                drop()
                rotateClockwise()
                grab()
                forward()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                back()
                drop()
                forward()
                forward()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                back()
                drop()
                forward()
                grab()
                rotateClockwise()
                back()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                pivotClockwise()
                back()
                drop()
                forward()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                drop()
                forward()
                forward()
                grab()
                forward()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                back()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                forward()
                grab()
                forward()
                rotateClockwise()
                back()
                back()
                pivotCounterClockwise()
                back()
                drop()
                forward()
                forward()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                back()
                forward()
                forward()
                pivotCounterClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                back()
                pivotCounterClockwise()
                drop()
                forward()
                forward()
                grab()
                forward()
                back()
                drop()
                forward()
                grab()
                pivotClockwise()
                back()
                back()
                drop()
                back()
                back()
                rotateClockwise()
                grab()
                back()
                back()
                drop()
                forward()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                forward()
                drop()
                back()
                back()
                grab()
                forward()
                drop()
                forward()
                grab()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                forward()
                forward()
                reset()
            }
        }
        )
    }
}
