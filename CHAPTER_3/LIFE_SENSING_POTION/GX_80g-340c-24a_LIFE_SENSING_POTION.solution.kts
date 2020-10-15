
solution {
    puzzle = "P030b"
    name = "B GCX"
    arm(ARM1) {
        number = 1
        position = 0 to -2
        rotation = -4
        size = 2
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = -4
    }
    glyph(CALCIFICATION) {
        position = -1 to -1
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = -1 to -2
        rotation = -2
    }
    glyph(EQUILIBRIUM) {
        position = 0 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 3 to -2
        rotation = 2
    }
    track {
        position = 1 to -3
        positions = listOf(-1 to 1, 0 to 1, 1 to 0, 0 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                back()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                grab()
                back()
                back()
                rotateCounterClockwise()
                back()
                drop()
                forward()
                grab()
                rotateClockwise()
                back()
                drop()
                back()
                grab()
                back()
                back()
                pivotClockwise()
                back()
                drop()
                back()
                grab()
                back()
                back()
                pivotClockwise()
                back()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                forward()
                forward()
                rotateClockwise()
                pivotClockwise()
                back()
                drop()
                back()
                grab()
                back()
                back()
                pivotClockwise()
                back()
                drop()
                back()
                grab()
                back()
                back()
                pivotClockwise()
                back()
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
