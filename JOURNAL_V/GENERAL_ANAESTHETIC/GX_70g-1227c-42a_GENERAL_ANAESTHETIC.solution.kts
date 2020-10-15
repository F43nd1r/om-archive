
solution {
    puzzle = "P086"
    name = "B GX"
    arm(ARM1) {
        number = 1
        position = -1 to 1
        rotation = 3
        size = 2
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = -3
    }
    glyph(ANIMISMUS) {
        position = 1 to 1
        rotation = -7
    }
    glyph(EQUILIBRIUM) {
        position = 3 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 5 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 0
        rotation = 0
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
        position = 0 to -3
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
    io(OUTPUT) {
        index = 0
        position = 3 to -2
        rotation = 6
    }
    io(INPUT) {
        index = 1
        position = -3 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 3
        position = 2 to 2
        rotation = 0
    }
    track {
        position = -1 to 1
        positions = listOf(0 to 0, 1 to 0, 1 to 1, 0 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                back()
                grab()
                back()
                back()
                drop()
                forward()
                forward()
                grab()
                rotateClockwise()
                drop()
                forward()
                grab()
                forward()
                forward()
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
                pivotCounterClockwise()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                forward()
                grab()
                back()
                back()
                drop()
                forward()
                forward()
                grab()
                rotateClockwise()
                drop()
                forward()
                grab()
                forward()
                forward()
                rotateClockwise()
                forward()
                pivotCounterClockwise()
                back()
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
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                forward()
                grab()
                back()
                back()
                drop()
                forward()
                forward()
                grab()
                rotateClockwise()
                drop()
                forward()
                grab()
                back()
                rotateClockwise()
                back()
                forward()
                pivotCounterClockwise()
                back()
                back()
                forward()
                forward()
                drop()
                back()
                rotateClockwise()
                back()
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                back()
                rotateClockwise()
                rotateClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                forward()
                grab()
                back()
                back()
                drop()
                forward()
                forward()
                grab()
                rotateClockwise()
                drop()
                forward()
                grab()
                rotateClockwise()
                back()
                back()
                pivotCounterClockwise()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                back()
                back()
                rotateClockwise()
                rotateClockwise()
                back()
                back()
                pivotCounterClockwise()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                forward()
                grab()
                forward()
                rotateClockwise()
                rotateClockwise()
                back()
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
                back()
                grab()
                forward()
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
                grab()
                forward()
                drop()
                rotateClockwise()
                rotateClockwise()
                back()
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                forward()
                forward()
                reset()
            }
        }
        )
    }
}
