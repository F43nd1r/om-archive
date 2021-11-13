
solution {
    puzzle = "P089"
    name = "OVERLAP A"
    arm(PISTON) {
        number = 1
        position = 2 to -1
        rotation = 1
        size = 1
    }
    glyph(BONDER) {
        position = -2 to 0
        rotation = 1
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = 1
    }
    glyph(BONDER) {
        position = 1 to 1
        rotation = -1
    }
    glyph(BONDER) {
        position = -1 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = 0 to 2
        rotation = -1
    }
    glyph(BONDER) {
        position = -1 to 2
        rotation = 0
    }
    glyph(BONDER) {
        position = -1 to 1
        rotation = 2
    }
    glyph(BONDER) {
        position = -2 to 1
        rotation = 1
    }
    glyph(BONDER) {
        position = -2 to 2
        rotation = 0
    }
    glyph(BONDER) {
        position = 2 to 0
        rotation = -3
    }
    glyph(BONDER) {
        position = 1 to 0
        rotation = 4
    }
    glyph(BONDER) {
        position = 1 to 0
        rotation = -4
    }
    glyph(BONDER) {
        position = 2 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = 3
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = 2
    }
    glyph(BONDER) {
        position = -2 to 0
        rotation = -1
    }
    glyph(BONDER) {
        position = 0 to -2
        rotation = 0
    }
    glyph(BONDER) {
        position = 0 to -2
        rotation = 1
    }
    glyph(BONDER) {
        position = 0 to -2
        rotation = 2
    }
    glyph(BONDER) {
        position = 2 to -2
        rotation = 1
    }
    glyph(BONDER) {
        position = 1 to -2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -1 to 1
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 0 to 1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 0 to 1
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 1 to 0
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -1 to 0
        rotation = -2
    }
    glyph(CALCIFICATION) {
        position = 0 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -2 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -2 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to 2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 1 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 1 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 2 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 0 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 1 to -2
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 0 to 1
        rotation = 3
    }
    glyph(DUPLICATION) {
        position = 0 to 1
        rotation = 1
    }
    glyph(DUPLICATION) {
        position = -1 to 1
        rotation = 3
    }
    glyph(DUPLICATION) {
        position = -2 to 1
        rotation = -2
    }
    glyph(DUPLICATION) {
        position = -1 to 0
        rotation = 2
    }
    glyph(DUPLICATION) {
        position = -2 to 1
        rotation = 1
    }
    glyph(DUPLICATION) {
        position = -2 to 2
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -1 to 2
        rotation = -1
    }
    glyph(DUPLICATION) {
        position = 0 to 1
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 1 to 1
        rotation = -1
    }
    glyph(DUPLICATION) {
        position = 2 to 0
        rotation = -2
    }
    glyph(DUPLICATION) {
        position = 2 to -1
        rotation = 3
    }
    glyph(DUPLICATION) {
        position = 2 to -1
        rotation = 2
    }
    glyph(DUPLICATION) {
        position = 0 to -1
        rotation = 2
    }
    glyph(DUPLICATION) {
        position = -1 to 0
        rotation = -2
    }
    glyph(DUPLICATION) {
        position = -1 to -1
        rotation = -1
    }
    glyph(DUPLICATION) {
        position = 2 to -3
        rotation = 2
    }
    glyph(DUPLICATION) {
        position = 1 to -2
        rotation = 2
    }
    glyph(DUPLICATION) {
        position = 0 to -1
        rotation = -2
    }
    glyph(DUPLICATION) {
        position = 2 to -3
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = 2 to -3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 0 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -2 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 3
        position = 2 to 0
        rotation = 0
    }
    track {
        position = 1 to -4
        positions = listOf(-2 to 3, -1 to 2, 0 to 1, 0 to 2, 1 to 2, 0 to 3, 0 to 4, 1 to 3)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                back()
                rotateCounterClockwise()
                extend()
                drop()
                retract()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                back()
                back()
                back()
                back()
                back()
                back()
                extend()
                extend()
                grab()
                retract()
                pivotCounterClockwise()
                drop()
                retract()
                forward()
                forward()
                forward()
                forward()
                forward()
                extend()
                grab()
                pivotClockwise()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                back()
                grab()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                forward()
                drop()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                back()
                grab()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                back()
                back()
                back()
                rotateCounterClockwise()
                extend()
                extend()
                grab()
                forward()
                drop()
                back()
                grab()
                forward()
                drop()
                retract()
                retract()
                grab()
                back()
                extend()
                drop()
                retract()
                forward()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                back()
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
