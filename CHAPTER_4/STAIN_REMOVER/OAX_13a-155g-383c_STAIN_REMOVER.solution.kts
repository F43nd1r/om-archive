
solution {
    puzzle = "P034"
    name = "OA"
    arm(PISTON) {
        number = 1
        position = -1 to 0
        rotation = -2
        size = 1
    }
    glyph(BONDER) {
        position = -1 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = -2 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = -2 to 0
        rotation = -5
    }
    glyph(BONDER) {
        position = -2 to 0
        rotation = -1
    }
    glyph(BONDER) {
        position = -3 to 1
        rotation = -1
    }
    glyph(BONDER) {
        position = -2 to 0
        rotation = -2
    }
    glyph(CALCIFICATION) {
        position = 0 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to 1
        rotation = 0
    }
    glyph(PURIFICATION) {
        position = -4 to 1
        rotation = -2
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -2 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -2 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -4 to 0
        rotation = 0
    }
    track {
        position = -1 to 0
        positions = listOf(0 to 1, 0 to 0, -1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                forward()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateClockwise()
                grab()
                pivotClockwise()
                pivotClockwise()
                drop()
                extend()
                grab()
                pivotClockwise()
                drop()
                retract()
                back()
                grab()
                rotateClockwise()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                extend()
                grab()
                pivotCounterClockwise()
                drop()
                retract()
                rotateCounterClockwise()
                back()
                extend()
                extend()
                grab()
                back()
                drop()
                retract()
                grab()
                pivotCounterClockwise()
                drop()
                retract()
                forward()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                back()
                reset()
            }
        }
        )
    }
}
