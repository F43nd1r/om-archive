
solution {
    puzzle = "w2450511665"
    name = "OVERLAP AX"
    arm(ARM1) {
        number = 1
        position = 1 to -1
        rotation = 1
        size = 1
    }
    glyph(BONDER) {
        position = 2 to -2
        rotation = 0
    }
    glyph(BONDER) {
        position = 3 to -2
        rotation = 1
    }
    glyph(BONDER) {
        position = 2 to 0
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 2 to -2
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 1 to 0
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 2 to -1
        rotation = 2
    }
    glyph(UNBONDER) {
        position = 2 to -1
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = 2 to -2
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = 2 to -1
        rotation = -7
    }
    glyph(DISPOSAL) {
        position = 2 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 3 to -1
        rotation = -6
    }
    io(INPUT) {
        index = 0
        position = 3 to -1
        rotation = -3
    }
    track {
        position = 1 to -1
        positions = listOf(0 to -1, 0 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
                forward()
                grab()
                back()
                forward()
                drop()
                back()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                forward()
                grab()
                back()
                back()
                forward()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                forward()
                back()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                forward()
                grab()
                back()
                forward()
                drop()
                back()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                back()
                back()
                forward()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                forward()
                back()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                forward()
                grab()
                back()
                forward()
                drop()
                back()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                forward()
                drop()
                back()
                rotateClockwise()
                grab()
                forward()
                drop()
                back()
                rotateClockwise()
                grab()
                forward()
                rotateClockwise()
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
