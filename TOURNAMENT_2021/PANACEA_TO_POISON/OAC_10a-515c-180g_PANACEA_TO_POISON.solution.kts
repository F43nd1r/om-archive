
solution {
    puzzle = "w2450511665"
    name = "OVERLAP AC"
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
    glyph(BONDER) {
        position = 1 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = 1 to -2
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
    glyph(UNBONDER) {
        position = 2 to -2
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 1 to 0
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 1 to -1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 0 to -1
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
    io(INPUT) {
        index = 0
        position = 3 to -1
        rotation = -3
    }
    io(OUTPUT) {
        index = 0
        position = 3 to -1
        rotation = -6
    }
    track {
        position = 1 to -1
        positions = listOf(1 to -1, 0 to -1, 0 to 0, 1 to 0)
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
                back()
                pivotClockwise()
                forward()
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
                rotateClockwise()
                rotateCounterClockwise()
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
                back()
                pivotClockwise()
                forward()
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
                rotateClockwise()
                rotateClockwise()
                back()
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
