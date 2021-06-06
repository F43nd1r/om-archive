
solution {
    puzzle = "P030b"
    name = "OVERLAP GC"
    arm(ARM1) {
        number = 1
        position = -2 to 1
        rotation = -2
        size = 1
    }
    glyph(BONDER) {
        position = -2 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -2 to 0
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = -2 to 0
        rotation = 1
    }
    io(OUTPUT) {
        index = 0
        position = -3 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -2 to 0
        rotation = 0
    }
    track {
        position = -2 to 1
        positions = listOf(0 to 0, -1 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                forward()
                rotateCounterClockwise()
                drop()
                back()
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                drop()
                forward()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                back()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        )
    }
}
