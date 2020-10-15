
solution {
    puzzle = "P032"
    name = "B GX"
    arm(ARM1) {
        number = 1
        position = -2 to 0
        rotation = 1
        size = 2
    }
    glyph(BONDER) {
        position = -2 to 3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -4 to 3
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = -4 to 2
        rotation = 5
    }
    glyph(EQUILIBRIUM) {
        position = 0 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to 4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 4
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -2 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = -2 to 4
        rotation = -6
    }
    track {
        position = -1 to 0
        positions = listOf(-1 to 0, 0 to 0, 0 to 1, -1 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                back()
                rotateCounterClockwise()
                rotateClockwise()
                back()
                reset()
                wait(2)
                grab()
                back()
                pivotCounterClockwise()
                back()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                back()
                back()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                forward()
                forward()
                grab()
                rotateCounterClockwise()
                back()
                forward()
                drop()
                forward()
                grab()
                forward()
                forward()
                rotateClockwise()
                back()
                reset()
                wait(2)
                grab()
                back()
                back()
                back()
                reset()
                wait(1)
                grab()
                back()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                back()
                rotateClockwise()
                forward()
                rotateClockwise()
                back()
                reset()
                wait(2)
                grab()
                back()
                pivotClockwise()
                back()
                reset()
                wait(2)
                grab()
                back()
                rotateCounterClockwise()
                back()
                reset()
            }
        }
        )
    }
}
