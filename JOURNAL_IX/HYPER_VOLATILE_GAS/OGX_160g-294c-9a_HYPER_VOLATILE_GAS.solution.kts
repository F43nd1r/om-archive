
solution {
    puzzle = "P106"
    name = "OA"
    arm(PISTON) {
        number = 1
        position = 1 to -1
        rotation = 3
        size = 2
    }
    glyph(BONDER) {
        position = 1 to -2
        rotation = 2
    }
    glyph(BONDER) {
        position = -1 to -2
        rotation = 0
    }
    glyph(BONDER) {
        position = -1 to -2
        rotation = 1
    }
    glyph(TRIPLEX_BONDER) {
        position = -1 to 0
        rotation = 4
    }
    glyph(TRIPLEX_BONDER) {
        position = 0 to -1
        rotation = 2
    }
    glyph(TRIPLEX_BONDER) {
        position = -1 to -1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 0 to -1
        rotation = 2
    }
    glyph(UNBONDER) {
        position = -1 to -1
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 1 to -2
        rotation = 3
    }
    io(INPUT) {
        index = 0
        position = -1 to -1
        rotation = -1
    }
    io(OUTPUT) {
        index = 0
        position = -1 to -1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                pivotClockwise()
                drop()
                retract()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                extend()
                grab()
                pivotClockwise()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                extend()
                grab()
                pivotClockwise()
                drop()
                retract()
                grab()
                pivotClockwise()
                drop()
                extend()
                grab()
                pivotClockwise()
                drop()
                retract()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                extend()
                grab()
                pivotClockwise()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                extend()
                grab()
                pivotClockwise()
                drop()
            }
        }
        )
    }
}
