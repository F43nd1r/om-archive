
solution {
    puzzle = "P039"
    name = "OVERLAP AG"
    arm(PISTON) {
        number = 1
        position = 1 to -2
        rotation = 4
        size = 1
    }
    glyph(BONDER) {
        position = -1 to -3
        rotation = 1
    }
    glyph(BONDER) {
        position = -1 to -2
        rotation = 1
    }
    glyph(BONDER) {
        position = -1 to -1
        rotation = -1
    }
    glyph(BONDER) {
        position = 0 to -2
        rotation = 1
    }
    glyph(BONDER) {
        position = 1 to -3
        rotation = 1
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = -1
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = -1
    }
    glyph(BONDER) {
        position = -2 to 0
        rotation = -1
    }
    glyph(BONDER) {
        position = 0 to -3
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 0 to -2
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -1 to -1
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = 0 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to 0
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = -11 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 1 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 2 to -2
        rotation = 0
    }
    track {
        position = 0 to -2
        positions = listOf(1 to 0, 1 to 1, 0 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                drop()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                back()
                extend()
                drop()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                extend()
                grab()
                pivotClockwise()
                drop()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                extend()
                grab()
                pivotCounterClockwise()
                drop()
                retract()
                back()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateClockwise()
                grab()
                forward()
                extend()
                reset()
            }
        }
        )
    }
}
