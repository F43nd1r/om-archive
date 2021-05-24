
solution {
    puzzle = "P030b"
    name = "OVERLAP GG AG"
    arm(ARM1) {
        number = 1
        position = -2 to 0
        rotation = -1
        size = 1
    }
    glyph(BONDER) {
        position = -2 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to -1
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = -2 to 0
        rotation = -1
    }
    io(OUTPUT) {
        index = 0
        position = -2 to -1
        rotation = 1
    }
    io(INPUT) {
        index = 2
        position = -1 to -1
        rotation = 0
    }
    track {
        position = -3 to 1
        positions = listOf(0 to 0, 1 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                back()
                reset()
                wait(1)
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateClockwise()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
